package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Br.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 9.5f)
            curveToRelative(0f, -0.73f, -0.52f, -1.33f, -1.21f, -1.47f)
            curveToRelative(-0.69f, -3.44f, -3.14f, -6.23f, -6.35f, -7.41f)
            curveToRelative(-0.36f, -0.38f, -0.88f, -0.62f, -1.44f, -0.62f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.57f, 0f, -1.08f, 0.24f, -1.44f, 0.62f)
            curveToRelative(-3.21f, 1.18f, -5.66f, 3.96f, -6.35f, 7.41f)
            curveToRelative(-0.69f, 0.14f, -1.21f, 0.74f, -1.21f, 1.47f)
            curveToRelative(0f, 0.76f, 0.57f, 1.38f, 1.3f, 1.48f)
            lineToRelative(2.11f, 9.14f)
            curveToRelative(0.53f, 2.28f, 2.53f, 3.88f, 4.87f, 3.88f)
            horizontalLineToRelative(5.43f)
            curveToRelative(2.34f, 0f, 4.35f, -1.59f, 4.87f, -3.88f)
            lineToRelative(2.11f, -9.14f)
            curveToRelative(0.73f, -0.1f, 1.3f, -0.72f, 1.3f, -1.48f)
            close()
            moveTo(8.31f, 4.06f)
            curveToRelative(0.35f, 0.56f, 0.98f, 0.94f, 1.69f, 0.94f)
            horizontalLineToRelative(4f)
            curveToRelative(0.71f, 0f, 1.34f, -0.38f, 1.69f, -0.94f)
            curveToRelative(1.43f, 0.89f, 2.52f, 2.29f, 3.01f, 3.94f)
            lineTo(5.3f, 8f)
            curveToRelative(0.49f, -1.66f, 1.58f, -3.05f, 3.01f, -3.94f)
            close()
            moveTo(16.66f, 19.45f)
            curveToRelative(-0.21f, 0.91f, -1.01f, 1.55f, -1.95f, 1.55f)
            horizontalLineToRelative(-5.43f)
            curveToRelative(-0.94f, 0f, -1.74f, -0.64f, -1.95f, -1.55f)
            lineToRelative(-0.8f, -3.45f)
            horizontalLineToRelative(7.96f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.85f, 13.0f)
            lineToRelative(-0.46f, -2f)
            horizontalLineToRelative(13.23f)
            lineToRelative(-1.95f, 8.45f)
            close()
        }
    }.also { _Bucket = it }
