package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NairaSign: ImageVector? = null

val Icons.Ss.NairaSign: ImageVector
    get() = _NairaSign ?: UXIcon(name = "NairaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 11f)
                horizontalLineToRelative(-7.45f)
                lineTo(6.14f, 1.03f)
                curveTo(5.59f, 0.19f, 4.58f, -0.19f, 3.61f, 0.09f)
                curveToRelative(-0.96f, 0.28f, -1.61f, 1.15f, -1.61f, 2.16f)
                lineTo(2f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(2f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                lineTo(4f, 13f)
                horizontalLineToRelative(7.45f)
                lineToRelative(6.41f, 9.97f)
                curveToRelative(0.42f, 0.66f, 1.13f, 1.03f, 1.88f, 1.03f)
                curveToRelative(0.21f, 0f, 0.43f, -0.03f, 0.64f, -0.09f)
                curveToRelative(0.96f, -0.28f, 1.61f, -1.15f, 1.61f, -2.16f)
                lineTo(21.99f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 11f)
                lineTo(4f, 2.25f)
                reflectiveCurveToRelative(0f, -0.18f, 0.18f, -0.24f)
                curveToRelative(0.18f, -0.06f, 0.25f, 0.06f, 0.28f, 0.1f)
                lineToRelative(5.71f, 8.89f)
                lineTo(4f, 11f)
                close()
                moveTo(20f, 21.75f)
                reflectiveCurveToRelative(0f, 0.18f, -0.18f, 0.24f)
                curveToRelative(-0.18f, 0.06f, -0.25f, -0.06f, -0.28f, -0.1f)
                lineToRelative(-5.71f, -8.89f)
                horizontalLineToRelative(6.17f)
                verticalLineToRelative(8.75f)
                close()
            }
        }.also { _NairaSign = it}
