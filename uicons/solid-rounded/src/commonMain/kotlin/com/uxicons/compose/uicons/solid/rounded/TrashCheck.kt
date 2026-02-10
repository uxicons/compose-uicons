package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Sr.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 4f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                lineTo(2f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.86f)
                lineToRelative(1.3f, 13.48f)
                curveToRelative(0.25f, 2.58f, 2.39f, 4.52f, 4.98f, 4.52f)
                horizontalLineToRelative(5.73f)
                curveToRelative(2.59f, 0f, 4.73f, -1.95f, 4.98f, -4.53f)
                lineToRelative(1.28f, -13.47f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(-7.63f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                close()
                moveTo(16.74f, 12.73f)
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
                curveToRelative(0.38f, 0.4f, 0.36f, 1.03f, -0.04f, 1.41f)
                close()
            }
        }.also { _TrashCheck = it}
