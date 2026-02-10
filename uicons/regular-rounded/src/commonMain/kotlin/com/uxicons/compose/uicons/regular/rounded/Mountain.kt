package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Rr.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.62f, 19.29f)
                lineTo(14.48f, 1.49f)
                curveToRelative(-0.49f, -0.92f, -1.44f, -1.49f, -2.48f, -1.49f)
                reflectiveCurveToRelative(-1.99f, 0.57f, -2.48f, 1.5f)
                lineTo(0.38f, 19.29f)
                curveToRelative(-0.54f, 1.02f, -0.5f, 2.21f, 0.09f, 3.19f)
                curveToRelative(0.59f, 0.98f, 1.63f, 1.57f, 2.77f, 1.57f)
                horizontalLineToRelative(17.52f)
                curveToRelative(1.14f, 0f, 2.18f, -0.59f, 2.77f, -1.57f)
                curveToRelative(0.59f, -0.99f, 0.63f, -2.18f, 0.09f, -3.19f)
                close()
                moveTo(11.29f, 2.43f)
                curveToRelative(0.2f, -0.39f, 0.56f, -0.43f, 0.71f, -0.43f)
                reflectiveCurveToRelative(0.5f, 0.04f, 0.7f, 0.42f)
                lineToRelative(3.58f, 6.95f)
                lineToRelative(-1.48f, 2.52f)
                lineToRelative(-0.95f, -1.56f)
                curveToRelative(-0.18f, -0.3f, -0.5f, -0.48f, -0.85f, -0.48f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.18f, -0.85f, 0.47f)
                lineToRelative(-1.62f, 2.7f)
                lineToRelative(-2.58f, -4.08f)
                lineToRelative(3.34f, -6.5f)
                close()
                moveTo(21.82f, 21.45f)
                curveToRelative(-0.23f, 0.38f, -0.61f, 0.6f, -1.06f, 0.6f)
                lineTo(3.24f, 22.05f)
                curveToRelative(-0.44f, 0f, -0.83f, -0.22f, -1.06f, -0.6f)
                curveToRelative(-0.23f, -0.39f, -0.24f, -0.83f, -0.03f, -1.23f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.01f, 0.01f, -0.01f)
                lineToRelative(4.73f, -9.21f)
                lineToRelative(1.95f, 3.09f)
                curveToRelative(0.36f, 0.57f, 0.98f, 0.92f, 1.66f, 0.92f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.68f, -0.0f, 1.3f, -0.35f, 1.66f, -0.92f)
                lineToRelative(0.83f, -1.32f)
                lineToRelative(0.2f, 0.33f)
                curveToRelative(0.35f, 0.58f, 0.95f, 0.87f, 1.63f, 0.91f)
                curveToRelative(0.67f, -0.01f, 1.28f, -0.35f, 1.62f, -0.94f)
                lineToRelative(0.92f, -1.58f)
                lineToRelative(4.49f, 8.73f)
                curveToRelative(0.21f, 0.4f, 0.2f, 0.85f, -0.03f, 1.23f)
                close()
            }
        }.also { _Mountain = it}
