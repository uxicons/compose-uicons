package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Rr.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.69f, 13.73f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.69f, 0.27f)
                curveToRelative(-0.27f, 0f, -0.53f, -0.1f, -0.73f, -0.31f)
                lineToRelative(-1.92f, -2.04f)
                lineToRelative(0.62f, 4.98f)
                curveToRelative(0.11f, 0.85f, -0.16f, 1.71f, -0.73f, 2.36f)
                curveToRelative(-0.34f, 0.39f, -0.78f, 0.66f, -1.25f, 0.83f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.19f)
                curveToRelative(-0.47f, -0.17f, -0.91f, -0.44f, -1.25f, -0.83f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.5f, -0.73f, -2.36f)
                lineToRelative(0.62f, -4.96f)
                lineToRelative(-1.92f, 2.02f)
                curveToRelative(-0.2f, 0.21f, -0.46f, 0.31f, -0.73f, 0.31f)
                curveToRelative(-0.25f, 0f, -0.49f, -0.09f, -0.69f, -0.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.04f, -1.41f)
                lineToRelative(4.47f, -4.72f)
                curveToRelative(0.76f, -0.97f, 1.94f, -1.59f, 3.25f, -1.59f)
                curveToRelative(1.17f, 0f, 2.22f, 0.5f, 2.98f, 1.29f)
                curveToRelative(0.02f, 0.02f, 4.75f, 5.02f, 4.75f, 5.02f)
                curveToRelative(0.38f, 0.4f, 0.36f, 1.03f, -0.04f, 1.41f)
                close()
                moveTo(10.29f, 8.88f)
                curveToRelative(-0.21f, 0.28f, -0.35f, 0.62f, -0.4f, 0.99f)
                lineToRelative(-0.88f, 7.01f)
                curveToRelative(-0.04f, 0.29f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.22f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineToRelative(4f)
                curveToRelative(0.29f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.19f, -0.22f, 0.28f, -0.5f, 0.24f, -0.79f)
                lineToRelative(-0.88f, -7.01f)
                curveToRelative(-0.13f, -1.06f, -1.04f, -1.87f, -2.12f, -1.87f)
                curveToRelative(-0.51f, 0f, -0.98f, 0.18f, -1.35f, 0.49f)
                lineToRelative(-0.37f, 0.39f)
                close()
            }
        }.also { _PersonDress = it}
