package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Rs.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.75f, 13f)
                curveToRelative(-2.55f, 0f, -6.01f, 2.91f, -6.4f, 3.24f)
                lineToRelative(-0.96f, 0.82f)
                lineToRelative(1.02f, 0.74f)
                curveToRelative(0.12f, 0.09f, 3.05f, 2.19f, 6.34f, 2.19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.75f, 18f)
                curveToRelative(-1.52f, 0f, -3.0f, -0.6f, -3.98f, -1.11f)
                curveToRelative(1.29f, -0.93f, 2.96f, -1.89f, 3.98f, -1.89f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-3.25f, -1.22f)
                curveToRelative(-0.74f, -2.47f, -3.04f, -4.28f, -5.75f, -4.28f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.34f, 0.44f, 2.58f, 1.18f, 3.57f)
                curveToRelative(-1.51f, 1.52f, -4.01f, 3.43f, -5.18f, 3.43f)
                curveToRelative(-1.13f, 0f, -3.16f, -3.36f, -3.16f, -3.36f)
                lineToRelative(-0.71f, 1.47f)
                curveToRelative(-1.53f, 3.17f, -1.5f, 6.58f, 0.1f, 9.13f)
                curveToRelative(1.5f, 2.39f, 4.2f, 3.77f, 7.42f, 3.77f)
                horizontalLineToRelative(6.94f)
                curveToRelative(3.59f, 0f, 7.41f, -2.56f, 7.41f, -7.3f)
                curveToRelative(0f, -2.62f, -2.02f, -5.53f, -3.33f, -6.94f)
                curveToRelative(0.35f, -0.44f, 0.65f, -0.93f, 0.87f, -1.46f)
                lineToRelative(3.46f, -1.3f)
                close()
                moveTo(15f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(15.59f, 22f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(-2.55f, 0f, -4.58f, -1.0f, -5.72f, -2.83f)
                curveToRelative(-0.97f, -1.55f, -1.18f, -3.56f, -0.61f, -5.59f)
                curveToRelative(0.6f, 0.76f, 1.37f, 1.42f, 2.68f, 1.42f)
                curveToRelative(2.02f, 0f, 4.92f, -2.32f, 6.62f, -4.05f)
                curveToRelative(0.96f, 0.66f, 2.13f, 1.05f, 3.38f, 1.05f)
                curveToRelative(1.17f, 0f, 2.26f, -0.34f, 3.18f, -0.91f)
                curveToRelative(1.12f, 1.18f, 2.82f, 3.67f, 2.82f, 5.61f)
                curveToRelative(0f, 3.89f, -3.23f, 5.3f, -5.41f, 5.3f)
                close()
            }
        }.also { _Duck = it}
