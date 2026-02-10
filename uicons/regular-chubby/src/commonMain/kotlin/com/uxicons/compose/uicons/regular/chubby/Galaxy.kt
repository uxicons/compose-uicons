package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Rc.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 16f)
                curveToRelative(0f, 0.4f, -0.24f, 0.77f, -0.62f, 0.92f)
                curveToRelative(-0.37f, 0.15f, -0.8f, 0.07f, -1.09f, -0.22f)
                curveToRelative(-1.23f, -1.24f, -2.47f, -1.94f, -3.34f, -2.32f)
                curveToRelative(-0.39f, 6.02f, -3.43f, 8.61f, -9.96f, 8.61f)
                curveToRelative(-0.4f, 0f, -0.77f, -0.24f, -0.92f, -0.62f)
                curveToRelative(-0.15f, -0.37f, -0.07f, -0.8f, 0.22f, -1.09f)
                curveToRelative(1.23f, -1.24f, 1.94f, -2.47f, 2.32f, -3.33f)
                curveToRelative(-6.02f, -0.39f, -8.61f, -3.43f, -8.61f, -9.96f)
                curveToRelative(0f, -0.4f, 0.24f, -0.77f, 0.62f, -0.92f)
                curveToRelative(0.37f, -0.15f, 0.8f, -0.07f, 1.09f, 0.22f)
                curveToRelative(1.23f, 1.24f, 2.47f, 1.94f, 3.34f, 2.32f)
                curveToRelative(0.39f, -6.02f, 3.43f, -8.61f, 9.96f, -8.61f)
                curveToRelative(0.4f, 0f, 0.77f, 0.24f, 0.92f, 0.62f)
                curveToRelative(0.15f, 0.37f, 0.07f, 0.8f, -0.22f, 1.09f)
                curveToRelative(-1.23f, 1.24f, -1.94f, 2.47f, -2.32f, 3.33f)
                curveToRelative(6.02f, 0.39f, 8.61f, 3.43f, 8.61f, 9.96f)
                close()
                moveTo(20.87f, 13.75f)
                curveToRelative(-0.53f, -4.2f, -2.79f, -5.75f, -7.87f, -5.75f)
                curveToRelative(-0.3f, 0f, -0.58f, -0.13f, -0.77f, -0.37f)
                curveToRelative(-0.19f, -0.23f, -0.27f, -0.54f, -0.21f, -0.83f)
                curveToRelative(0.02f, -0.09f, 0.36f, -1.71f, 1.73f, -3.68f)
                curveToRelative(-4.2f, 0.53f, -5.75f, 2.79f, -5.75f, 7.87f)
                curveToRelative(0f, 0.3f, -0.14f, 0.58f, -0.37f, 0.77f)
                curveToRelative(-0.23f, 0.19f, -0.53f, 0.27f, -0.83f, 0.21f)
                curveToRelative(-0.09f, -0.02f, -1.71f, -0.36f, -3.68f, -1.73f)
                curveToRelative(0.53f, 4.2f, 2.79f, 5.75f, 7.87f, 5.75f)
                curveToRelative(0.3f, 0f, 0.58f, 0.13f, 0.77f, 0.37f)
                curveToRelative(0.19f, 0.23f, 0.27f, 0.54f, 0.21f, 0.83f)
                curveToRelative(-0.02f, 0.09f, -0.36f, 1.71f, -1.73f, 3.68f)
                curveToRelative(4.2f, -0.53f, 5.75f, -2.79f, 5.75f, -7.87f)
                curveToRelative(0f, -0.3f, 0.14f, -0.58f, 0.37f, -0.77f)
                reflectiveCurveToRelative(0.54f, -0.27f, 0.83f, -0.21f)
                curveToRelative(0.09f, 0.02f, 1.71f, 0.36f, 3.68f, 1.73f)
                close()
            }
        }.also { _Galaxy = it}
