package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Sc.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(17.4f, 12f)
                curveToRelative(0f, 2.47f, -0.35f, 3.81f, -1.19f, 4.55f)
                lineToRelative(-1.72f, -2.57f)
                lineToRelative(0.57f, -1.76f)
                lineToRelative(2.33f, -0.88f)
                curveToRelative(0.01f, 0.21f, 0.01f, 0.43f, 0.01f, 0.65f)
                close()
                moveTo(6.6f, 12f)
                curveToRelative(0f, -0.23f, 0.0f, -0.44f, 0.01f, -0.65f)
                lineToRelative(2.33f, 0.88f)
                lineToRelative(0.57f, 1.77f)
                lineToRelative(-1.71f, 2.56f)
                curveToRelative(-0.85f, -0.73f, -1.2f, -2.08f, -1.2f, -4.56f)
                close()
                moveTo(11.33f, 13.12f)
                lineToRelative(-0.41f, -1.28f)
                lineToRelative(1.08f, -0.79f)
                lineToRelative(1.08f, 0.79f)
                lineToRelative(-0.41f, 1.28f)
                horizontalLineToRelative(-1.34f)
                close()
                moveTo(14.41f, 10.33f)
                lineToRelative(-1.41f, -1.02f)
                verticalLineToRelative(-2.7f)
                curveToRelative(2.44f, 0.08f, 3.7f, 0.53f, 4.17f, 2.68f)
                lineToRelative(-2.76f, 1.04f)
                close()
                moveTo(11f, 6.61f)
                verticalLineToRelative(2.7f)
                lineToRelative(-1.41f, 1.03f)
                lineToRelative(-2.76f, -1.04f)
                curveToRelative(0.47f, -2.15f, 1.74f, -2.6f, 4.17f, -2.68f)
                close()
                moveTo(11.17f, 15.12f)
                horizontalLineToRelative(1.68f)
                lineToRelative(1.45f, 2.17f)
                curveToRelative(-0.65f, 0.09f, -1.41f, 0.11f, -2.3f, 0.11f)
                curveToRelative(-0.89f, 0f, -1.64f, -0.02f, -2.29f, -0.11f)
                lineToRelative(1.45f, -2.17f)
                close()
            }
        }.also { _Tire = it}
