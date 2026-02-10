package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Ts.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 10.49f)
                lineToRelative(-3.89f, 4.12f)
                curveToRelative(-2.15f, 2.15f, -2.15f, 5.63f, 0f, 7.78f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, 0.01f, -7.77f)
                lineToRelative(-3.9f, -4.13f)
                close()
                moveTo(8.68f, 21.68f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                curveToRelative(-1.75f, -1.75f, -1.75f, -4.61f, 0.01f, -6.38f)
                lineToRelative(3.17f, -3.36f)
                lineToRelative(3.18f, 3.37f)
                curveToRelative(1.75f, 1.75f, 1.75f, 4.61f, 0f, 6.36f)
                close()
                moveTo(22.53f, 10.76f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                reflectiveCurveToRelative(1.46f, -2.2f, 1.46f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(21.83f, 17.12f)
                curveToRelative(-1.51f, 1.51f, -4.15f, 1.51f, -5.66f, 0f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
                lineToRelative(2.83f, -2.77f)
                lineToRelative(2.83f, 2.77f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.1f, 0f, 5.66f)
                close()
                moveTo(10f, 0.41f)
                lineToRelative(-2.83f, 2.77f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                reflectiveCurveToRelative(1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, -0.0f, -5.66f)
                lineTo(10f, 0.41f)
                close()
                moveTo(12.12f, 8.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.12f)
                lineToRelative(2.12f, -2.08f)
                lineToRelative(2.12f, 2.08f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                close()
            }
        }.also { _Blood = it}
