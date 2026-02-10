package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Sr.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 17.34f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.33f, -3.0f, -2.88f, -5.34f, -5.96f, -5.34f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 3.07f, 2.32f, 5.61f, 5.3f, 5.96f)
                curveToRelative(0.23f, 0.03f, 0.46f, 0.04f, 0.7f, 0.04f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.23f, -0.01f, -0.45f, -0.04f, -0.66f)
                close()
                moveTo(20f, 20f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.59f)
                lineToRelative(1f, 1f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(0.59f, 0f, 1.16f, 0.07f, 1.72f, 0.19f)
                lineToRelative(0.4f, -4.19f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                lineTo(1f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.86f)
                lineToRelative(1.3f, 13.48f)
                curveToRelative(0.25f, 2.58f, 2.39f, 4.52f, 4.98f, 4.52f)
                horizontalLineToRelative(4.59f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
                moveTo(7.18f, 4f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(-7.63f)
                close()
            }
        }.also { _TrashClock = it}
