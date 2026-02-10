package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Columns3: ImageVector? = null

val Icons.Rs.Columns3: ImageVector
    get() = _Columns3 ?: UXIcon(name = "Columns3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 4f)
                horizontalLineToRelative(6f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(16f)
                lineTo(2f, 20f)
                lineTo(2f, 5f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-5f)
                lineTo(17f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Columns3 = it}
