package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Ts.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.69f)
                lineTo(4.1f, 4.42f)
                curveToRelative(0.55f, -0.46f, 0.9f, -1.15f, 0.9f, -1.92f)
                curveTo(5f, 1.12f, 3.88f, 0f, 2.5f, 0f)
                reflectiveCurveTo(0f, 1.12f, 0f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                lineTo(2f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.09f)
                lineToRelative(21f, -4f)
                verticalLineToRelative(-6.23f)
                close()
                moveTo(11f, 6.92f)
                lineToRelative(3f, 0.64f)
                lineTo(14f, 15.8f)
                lineToRelative(-3f, 0.57f)
                lineTo(11f, 6.92f)
                close()
                moveTo(10f, 16.56f)
                lineToRelative(-3f, 0.57f)
                lineTo(7f, 6.07f)
                lineToRelative(3f, 0.64f)
                verticalLineToRelative(9.85f)
                close()
                moveTo(15f, 7.78f)
                lineToRelative(3f, 0.64f)
                verticalLineToRelative(6.62f)
                lineToRelative(-3f, 0.57f)
                lineTo(15f, 7.78f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(3f, 5.21f)
                lineToRelative(3f, 0.64f)
                verticalLineToRelative(11.47f)
                lineToRelative(-3f, 0.57f)
                lineTo(3f, 5.21f)
                close()
                moveTo(23f, 14.09f)
                lineToRelative(-4f, 0.76f)
                verticalLineToRelative(-6.21f)
                lineToRelative(4f, 0.86f)
                verticalLineToRelative(4.59f)
                close()
            }
        }.also { _Windsock = it}
