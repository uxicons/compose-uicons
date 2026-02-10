package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Rs.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 10.49f)
                lineToRelative(-3.89f, 4.12f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                reflectiveCurveToRelative(0.57f, 2.85f, 1.61f, 3.89f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, 0.02f, -7.76f)
                lineToRelative(-3.91f, -4.14f)
                close()
                moveTo(7.97f, 20.97f)
                curveToRelative(-1.32f, 1.32f, -3.63f, 1.32f, -4.95f, 0f)
                curveToRelative(-0.66f, -0.66f, -1.02f, -1.54f, -1.02f, -2.48f)
                reflectiveCurveToRelative(0.36f, -1.81f, 1.05f, -2.5f)
                lineToRelative(2.45f, -2.6f)
                lineToRelative(2.48f, 2.62f)
                curveToRelative(1.36f, 1.36f, 1.36f, 3.58f, 0f, 4.95f)
                close()
                moveTo(22.53f, 9.46f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, -0.01f, -7.08f)
                close()
                moveTo(21.12f, 15.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, -0.01f, -4.24f)
                lineToRelative(2.13f, -2.08f)
                lineToRelative(2.12f, 2.07f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                close()
                moveTo(10f, 0.41f)
                lineToRelative(-2.83f, 2.77f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, -0.01f, -5.66f)
                lineTo(10f, 0.41f)
                close()
                moveTo(11.41f, 7.41f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.38f, -0.38f, -0.59f, -0.88f, -0.59f, -1.41f)
                reflectiveCurveToRelative(0.21f, -1.04f, 0.58f, -1.41f)
                lineToRelative(1.42f, -1.39f)
                lineToRelative(1.42f, 1.38f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _Blood = it}
