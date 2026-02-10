package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Rc.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.11f, 5.78f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f)
                curveToRelative(1.53f, 1.52f, 2.3f, 3.14f, 2.3f, 4.82f)
                curveToRelative(0f, 2.49f, -1.73f, 4.21f, -2.3f, 4.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.71f, -0.71f, 2.89f, -2.88f, 2.89f, -6.2f)
                curveToRelative(0f, -2.23f, -0.97f, -4.32f, -2.89f, -6.23f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.6f, 8.58f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f)
                curveToRelative(0.76f, 0.75f, 1.14f, 1.43f, 1.14f, 2.02f)
                curveToRelative(0f, 0.58f, -0.36f, 1.21f, -1.14f, 1.98f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.7f, -0.29f)
                curveToRelative(0.74f, -0.74f, 1.73f, -1.89f, 1.73f, -3.4f)
                curveToRelative(0f, -1.15f, -0.56f, -2.28f, -1.73f, -3.43f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.22f, 3.57f)
                curveToRelative(-0.53f, -0.25f, -1.09f, -0.2f, -1.51f, 0.14f)
                curveToRelative(-0.06f, 0.05f, -0.11f, 0.1f, -0.16f, 0.16f)
                curveToRelative(-1.31f, 1.68f, -2.87f, 3.3f, -3.25f, 3.46f)
                lineToRelative(-4.11f, 0.31f)
                curveToRelative(-0.3f, 0.02f, -0.57f, 0.17f, -0.74f, 0.42f)
                curveToRelative(-0.94f, 1.31f, -1.44f, 2.33f, -1.44f, 3.94f)
                curveToRelative(0f, 1.63f, 0.53f, 2.69f, 1.44f, 3.97f)
                curveToRelative(0.17f, 0.24f, 0.44f, 0.39f, 0.74f, 0.42f)
                lineToRelative(4.03f, 0.29f)
                curveToRelative(0.47f, 0.17f, 2.04f, 1.78f, 3.35f, 3.44f)
                curveToRelative(0.05f, 0.06f, 0.1f, 0.11f, 0.16f, 0.16f)
                curveToRelative(0.24f, 0.2f, 0.54f, 0.3f, 0.85f, 0.3f)
                curveToRelative(0.22f, 0f, 0.45f, -0.05f, 0.67f, -0.16f)
                curveToRelative(1.41f, -0.67f, 2.84f, -3.78f, 2.84f, -8.43f)
                reflectiveCurveToRelative(-1.43f, -7.75f, -2.84f, -8.43f)
                close()
                moveTo(11.66f, 18.3f)
                curveToRelative(-1.39f, -1.71f, -3.1f, -3.5f, -4.21f, -3.6f)
                lineToRelative(-3.64f, -0.27f)
                curveToRelative(-0.56f, -0.83f, -0.81f, -1.45f, -0.81f, -2.43f)
                curveToRelative(0f, -0.96f, 0.24f, -1.56f, 0.81f, -2.4f)
                lineToRelative(3.65f, -0.27f)
                curveToRelative(1.1f, -0.1f, 2.81f, -1.91f, 4.2f, -3.63f)
                curveToRelative(0.55f, 0.77f, 1.4f, 2.83f, 1.4f, 6.31f)
                reflectiveCurveToRelative(-0.85f, 5.53f, -1.4f, 6.3f)
                close()
            }
        }.also { _Volume = it}
