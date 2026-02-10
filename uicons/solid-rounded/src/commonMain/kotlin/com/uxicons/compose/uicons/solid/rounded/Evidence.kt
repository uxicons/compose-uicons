package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Evidence: ImageVector? = null

val Icons.Sr.Evidence: ImageVector
    get() = _Evidence ?: UXIcon(name = "Evidence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(8.5f, 13.5f)
                curveToRelative(0f, 0.87f, -0.62f, 1.5f, -1.36f, 1.5f)
                curveToRelative(-1.29f, 0f, -1.45f, -1.75f, -1.45f, -3f)
                horizontalLineToRelative(2.81f)
                reflectiveCurveToRelative(-0.01f, 1.19f, 0f, 1.5f)
                close()
                moveTo(8.52f, 11f)
                reflectiveCurveToRelative(-3.02f, 0.0f, -3.02f, 0f)
                curveToRelative(0f, 0f, -0.5f, -1.62f, -0.5f, -2.32f)
                curveToRelative(0f, -3f, 1.5f, -3.18f, 2.5f, -3.18f)
                curveToRelative(0.88f, 0f, 1.5f, 1f, 1.5f, 2.5f)
                curveToRelative(0f, 0.89f, -0.21f, 2.17f, -0.48f, 3f)
                close()
                moveTo(12.86f, 15f)
                curveToRelative(-0.73f, 0f, -1.36f, -0.63f, -1.36f, -1.5f)
                curveToRelative(0.01f, -0.31f, 0f, -1.5f, 0f, -1.5f)
                horizontalLineToRelative(2.81f)
                curveToRelative(0f, 1.25f, -0.15f, 3f, -1.45f, 3f)
                close()
                moveTo(14.5f, 11f)
                reflectiveCurveToRelative(-3.02f, 0f, -3.02f, 0f)
                curveToRelative(-0.28f, -0.83f, -0.48f, -2.11f, -0.48f, -3f)
                curveToRelative(0f, -1.5f, 0.62f, -2.5f, 1.5f, -2.5f)
                curveToRelative(1f, 0f, 2.5f, 0.18f, 2.5f, 3.18f)
                curveToRelative(0f, 0.7f, -0.5f, 2.32f, -0.5f, 2.32f)
                close()
            }
        }.also { _Evidence = it}
