package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Rr.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.78f, 11.31f)
                curveToRelative(0.38f, 0.4f, 0.36f, 1.03f, -0.04f, 1.41f)
                lineToRelative(-3.55f, 3.37f)
                curveToRelative(-0.57f, 0.56f, -1.33f, 0.85f, -2.09f, 0.85f)
                reflectiveCurveToRelative(-1.52f, -0.28f, -2.1f, -0.85f)
                lineToRelative(-1.61f, -1.47f)
                curveToRelative(-0.41f, -0.37f, -0.44f, -1.0f, -0.07f, -1.41f)
                reflectiveCurveToRelative(1.0f, -0.44f, 1.41f, -0.07f)
                lineToRelative(1.64f, 1.49f)
                curveToRelative(0.41f, 0.4f, 1.04f, 0.4f, 1.43f, 0.02f)
                lineToRelative(3.56f, -3.39f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f)
                close()
                moveTo(23f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.28f, 13.47f)
                curveToRelative(-0.24f, 2.58f, -2.38f, 4.53f, -4.98f, 4.53f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(-2.59f, 0f, -4.73f, -1.94f, -4.98f, -4.52f)
                lineToRelative(-1.3f, -13.48f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8.17f, 4f)
                horizontalLineToRelative(7.66f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                close()
                moveTo(19.11f, 6f)
                lineTo(4.87f, 6f)
                lineToRelative(1.28f, 13.29f)
                curveToRelative(0.15f, 1.55f, 1.43f, 2.71f, 2.99f, 2.71f)
                horizontalLineToRelative(5.73f)
                curveToRelative(1.56f, 0f, 2.84f, -1.17f, 2.99f, -2.72f)
                lineToRelative(1.26f, -13.28f)
                close()
            }
        }.also { _TrashCheck = it}
