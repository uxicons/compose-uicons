package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Rs.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 22f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.17f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, -0.0f, -3f, 1.34f, -3f, 3.0f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(6.17f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(6f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(18f, 11f)
                lineTo(21f, 8f)
                lineTo(24f, 11f)
                close()
            }
        }.also { _Lift = it}
