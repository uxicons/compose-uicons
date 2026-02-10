package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Rc.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2.0f)
                curveToRelative(-1.3f, -1.3f, -3.6f, -1.33f, -7.43f, -0.09f)
                curveToRelative(-3.89f, 1.26f, -7.44f, 3.96f, -9.28f, 5.88f)
                curveToRelative(-0.09f, 0.09f, -2.29f, 2.34f, -2.29f, 6.21f)
                curveToRelative(0f, 1.92f, 0.35f, 3.42f, 1.06f, 4.52f)
                lineToRelative(-2.77f, 2.77f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.77f, -2.77f)
                curveToRelative(1.11f, 0.71f, 2.6f, 1.06f, 4.52f, 1.06f)
                curveToRelative(3.87f, 0f, 6.11f, -2.2f, 6.21f, -2.29f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(2.08f, -2.17f, 4.81f, -5.99f, 5.87f, -9.26f)
                curveToRelative(1.24f, -3.83f, 1.22f, -6.13f, -0.09f, -7.43f)
                close()
                moveTo(5f, 14f)
                curveToRelative(0f, -3.01f, 1.64f, -4.72f, 1.72f, -4.81f)
                curveToRelative(1.83f, -1.9f, 5.15f, -4.3f, 8.46f, -5.38f)
                curveToRelative(1.86f, -0.6f, 3.12f, -0.82f, 3.96f, -0.82f)
                curveToRelative(0.79f, 0f, 1.22f, 0.19f, 1.45f, 0.41f)
                curveToRelative(0.41f, 0.41f, 0.69f, 1.46f, -0.02f, 4.13f)
                curveToRelative(-0.61f, -0.29f, -1.46f, -0.55f, -2.56f, -0.55f)
                curveToRelative(-2.35f, 0f, -3.57f, 1.16f, -3.71f, 1.29f)
                lineToRelative(-8.77f, 8.77f)
                curveToRelative(-0.36f, -0.75f, -0.52f, -1.75f, -0.52f, -3.06f)
                close()
                moveTo(18.26f, 12.75f)
                curveToRelative(-0.78f, -0.34f, -2.11f, -0.75f, -4.01f, -0.75f)
                curveToRelative(-0.31f, 0f, -0.59f, 0.02f, -0.87f, 0.04f)
                lineToRelative(2.32f, -2.32f)
                curveToRelative(0.03f, -0.03f, 0.79f, -0.72f, 2.3f, -0.72f)
                curveToRelative(0.93f, 0f, 1.57f, 0.26f, 1.94f, 0.47f)
                curveToRelative(-0.42f, 1.09f, -1.01f, 2.21f, -1.68f, 3.28f)
                close()
                moveTo(14.79f, 17.3f)
                curveToRelative(-0.14f, 0.13f, -1.84f, 1.7f, -4.79f, 1.7f)
                curveToRelative(-1.31f, 0f, -2.31f, -0.16f, -3.06f, -0.52f)
                lineToRelative(3.69f, -3.69f)
                curveToRelative(0.27f, -0.16f, 1.49f, -0.79f, 3.62f, -0.79f)
                curveToRelative(1.3f, 0f, 2.25f, 0.23f, 2.86f, 0.45f)
                curveToRelative(-0.83f, 1.16f, -1.67f, 2.16f, -2.32f, 2.84f)
                close()
            }
        }.also { _FeatherPointed = it}
