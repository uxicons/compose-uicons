package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Rs.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(3f)
                lineTo(24f, 3f)
                close()
                moveTo(9f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                lineTo(5f, 22f)
                verticalLineToRelative(-5f)
                close()
                moveTo(15f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Chimney = it}
