package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Sc.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.31f, 3.58f)
                curveToRelative(-0.42f, 0.07f, -0.75f, 0.4f, -0.83f, 0.82f)
                curveToRelative(-0.02f, 0.12f, -0.49f, 2.87f, -0.49f, 7.61f)
                curveToRelative(0f, 2.91f, 0.47f, 5.95f, 0.48f, 6.08f)
                curveToRelative(0.03f, 0.2f, 0.13f, 0.4f, 0.27f, 0.54f)
                curveToRelative(0.06f, 0.06f, 1.41f, 1.43f, 3.73f, 1.8f)
                curveToRelative(0.55f, 0.09f, 2.12f, 0.11f, 2.33f, 0.1f)
                verticalLineTo(4.27f)
                curveToRelative(-0.57f, -0.28f, -1.25f, -0.55f, -1.99f, -0.69f)
                curveToRelative(-1.63f, -0.3f, -3.44f, -0.02f, -3.52f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.52f, 5.91f)
                curveToRelative(-0.03f, -0.2f, -0.13f, -0.4f, -0.27f, -0.54f)
                curveToRelative(-0.06f, -0.06f, -1.41f, -1.43f, -3.73f, -1.8f)
                curveToRelative(-0.82f, -0.13f, -1.68f, -0.13f, -2.34f, -0.1f)
                curveToRelative(0.0f, 0.03f, 0.0f, 0.06f, 0.0f, 0.09f)
                verticalLineTo(19.72f)
                curveToRelative(0.57f, 0.28f, 1.25f, 0.55f, 1.99f, 0.69f)
                curveToRelative(0.56f, 0.1f, 1.14f, 0.14f, 1.66f, 0.14f)
                curveToRelative(1.0f, 0f, 1.8f, -0.12f, 1.85f, -0.13f)
                curveToRelative(0.42f, -0.07f, 0.75f, -0.4f, 0.83f, -0.82f)
                curveToRelative(0.02f, -0.12f, 0.49f, -2.87f, 0.49f, -7.61f)
                curveToRelative(0f, -2.91f, -0.47f, -5.95f, -0.48f, -6.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.82f, 3.58f)
                curveToRelative(-0.74f, 0.14f, -1.43f, 0.4f, -1.99f, 0.69f)
                verticalLineTo(20.54f)
                curveToRelative(0.21f, 0.01f, 0.45f, 0.02f, 0.69f, 0.02f)
                curveToRelative(0.52f, 0f, 1.1f, -0.03f, 1.66f, -0.14f)
                curveToRelative(0.74f, -0.14f, 1.43f, -0.4f, 1.99f, -0.69f)
                verticalLineTo(3.55f)
                curveToRelative(0f, -0.03f, 0.0f, -0.06f, 0.0f, -0.09f)
                curveToRelative(-0.67f, -0.04f, -1.54f, -0.03f, -2.36f, 0.12f)
                close()
            }
        }.also { _Map = it}
