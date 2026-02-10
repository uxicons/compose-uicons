package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TireFlat: ImageVector? = null

val Icons.Sc.TireFlat: ImageVector
    get() = _TireFlat ?: UXIcon(name = "TireFlat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.89f, 17.68f)
                curveToRelative(0.67f, -1.55f, 1.0f, -3.46f, 1.0f, -5.79f)
                curveTo(22.88f, 2.24f, 17.07f, 1f, 12f, 1f)
                reflectiveCurveTo(1.12f, 2.24f, 1.12f, 11.89f)
                curveToRelative(0f, 2.34f, 0.33f, 4.24f, 0.99f, 5.79f)
                curveToRelative(-0.67f, 0.48f, -0.99f, 1.0f, -0.99f, 1.59f)
                curveToRelative(0f, 1.39f, 1.41f, 3.73f, 10.88f, 3.73f)
                reflectiveCurveToRelative(10.88f, -2.33f, 10.88f, -3.73f)
                curveToRelative(0f, -0.58f, -0.34f, -1.11f, -1.0f, -1.59f)
                close()
                moveTo(6.67f, 11.89f)
                curveToRelative(0f, -0.22f, 0.0f, -0.43f, 0.01f, -0.63f)
                lineToRelative(2.28f, 0.86f)
                lineToRelative(0.56f, 1.74f)
                lineToRelative(-1.69f, 2.52f)
                curveToRelative(-0.83f, -0.72f, -1.17f, -2.06f, -1.17f, -4.49f)
                close()
                moveTo(17.1f, 9.2f)
                lineToRelative(-2.72f, 1.03f)
                lineToRelative(-1.38f, -1.01f)
                verticalLineToRelative(-2.66f)
                curveToRelative(2.39f, 0.08f, 3.63f, 0.53f, 4.1f, 2.63f)
                close()
                moveTo(17.33f, 11.89f)
                curveToRelative(0f, 2.43f, -0.34f, 3.76f, -1.16f, 4.49f)
                lineToRelative(-1.69f, -2.53f)
                lineToRelative(0.56f, -1.73f)
                lineToRelative(2.28f, -0.86f)
                curveToRelative(0.01f, 0.2f, 0.01f, 0.41f, 0.01f, 0.63f)
                close()
                moveTo(11.35f, 12.99f)
                lineToRelative(-0.41f, -1.25f)
                lineToRelative(1.06f, -0.77f)
                lineToRelative(1.06f, 0.77f)
                lineToRelative(-0.41f, 1.25f)
                horizontalLineToRelative(-1.31f)
                close()
                moveTo(11f, 6.57f)
                verticalLineToRelative(2.66f)
                lineToRelative(-1.39f, 1.01f)
                lineToRelative(-2.72f, -1.03f)
                curveToRelative(0.47f, -2.11f, 1.71f, -2.56f, 4.1f, -2.64f)
                close()
                moveTo(11.18f, 14.99f)
                horizontalLineToRelative(1.65f)
                lineToRelative(1.43f, 2.13f)
                curveToRelative(-0.64f, 0.09f, -1.38f, 0.11f, -2.26f, 0.11f)
                curveToRelative(-0.87f, 0f, -1.61f, -0.02f, -2.25f, -0.11f)
                lineToRelative(1.43f, -2.13f)
                close()
            }
        }.also { _TireFlat = it}
