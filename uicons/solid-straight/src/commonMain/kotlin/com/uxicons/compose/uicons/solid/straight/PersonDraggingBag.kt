package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDraggingBag: ImageVector? = null

val Icons.Ss.PersonDraggingBag: ImageVector
    get() = _PersonDraggingBag ?: UXIcon(name = "PersonDraggingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.18f, 16.7f)
                lineToRelative(3.8f, 2.33f)
                lineToRelative(-2.65f, 4.97f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(2.27f, -4.24f)
                lineToRelative(-4.09f, -2.51f)
                curveToRelative(-1.2f, -0.9f, -1.58f, -2.38f, -1.02f, -3.66f)
                lineToRelative(2.59f, -4.97f)
                curveToRelative(-0.06f, 0.04f, -5.81f, 3.72f, -5.81f, 3.72f)
                lineToRelative(-1.08f, -1.68f)
                lineToRelative(5.62f, -3.61f)
                curveToRelative(1.07f, -0.69f, 2.3f, -1.05f, 3.57f, -1.05f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.88f, 0f, 1.61f, 0.34f, 2.06f, 0.97f)
                curveToRelative(0.48f, 0.66f, 0.57f, 1.54f, 0.26f, 2.49f)
                lineToRelative(-0.86f, 1.73f)
                lineToRelative(2.97f, 1.76f)
                lineToRelative(-1.02f, 1.72f)
                lineToRelative(-2.85f, -1.7f)
                lineToRelative(-1.89f, 3.73f)
                close()
                moveTo(8.5f, 9f)
                lineToRelative(-4.5f, 1f)
                curveToRelative(0.63f, 1.26f, 1.31f, 2.52f, 2.07f, 3.28f)
                curveToRelative(-2.75f, 1.11f, -6.07f, 5.42f, -6.07f, 7.75f)
                curveToRelative(0f, 0.9f, 0.26f, 1.61f, 0.76f, 2.11f)
                curveToRelative(0.89f, 0.88f, 2.27f, 0.87f, 3.72f, 0.86f)
                curveToRelative(0f, 0f, 1.36f, 0.0f, 1.52f, 0.0f)
                curveToRelative(1.27f, 0f, 2.45f, -0.08f, 3.24f, -0.86f)
                curveToRelative(0.5f, -0.5f, 0.76f, -1.21f, 0.76f, -2.11f)
                curveToRelative(0f, -3.14f, -0.14f, -6.45f, -1.52f, -7.6f)
                curveToRelative(0.62f, -0.88f, 0.73f, -2.65f, 0.02f, -4.43f)
                close()
                moveTo(10.95f, 24f)
                horizontalLineToRelative(2.24f)
                lineToRelative(2.29f, -4.35f)
                lineToRelative(-1.73f, -1.02f)
                lineToRelative(-2.8f, 5.37f)
                close()
            }
        }.also { _PersonDraggingBag = it}
