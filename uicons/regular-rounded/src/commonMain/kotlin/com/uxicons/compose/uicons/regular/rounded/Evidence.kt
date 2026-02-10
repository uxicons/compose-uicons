package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Evidence: ImageVector? = null

val Icons.Rr.Evidence: ImageVector
    get() = _Evidence ?: UXIcon(name = "Evidence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 8f)
                curveToRelative(0f, 0.89f, -0.21f, 2.17f, -0.48f, 3f)
                curveToRelative(0f, 0f, -3.02f, 0.0f, -3.02f, 0f)
                curveToRelative(0f, 0f, -0.5f, -1.62f, -0.5f, -2.32f)
                curveToRelative(0f, -3f, 1.5f, -3.18f, 2.5f, -3.18f)
                curveToRelative(0.88f, 0f, 1.5f, 1f, 1.5f, 2.5f)
                close()
                moveTo(5.69f, 12f)
                curveToRelative(0f, 1.25f, 0.15f, 3f, 1.45f, 3f)
                curveToRelative(0.73f, 0f, 1.36f, -0.63f, 1.36f, -1.5f)
                curveToRelative(-0.01f, -0.31f, 0f, -1.5f, 0f, -1.5f)
                horizontalLineToRelative(-2.81f)
                close()
                moveTo(11.5f, 13.5f)
                curveToRelative(0f, 0.87f, 0.62f, 1.5f, 1.36f, 1.5f)
                curveToRelative(1.29f, 0f, 1.45f, -1.75f, 1.45f, -3f)
                horizontalLineToRelative(-2.81f)
                reflectiveCurveToRelative(0.01f, 1.19f, 0f, 1.5f)
                close()
                moveTo(12.5f, 5.5f)
                curveToRelative(-0.88f, 0f, -1.5f, 1f, -1.5f, 2.5f)
                curveToRelative(0f, 0.89f, 0.21f, 2.17f, 0.48f, 3f)
                curveToRelative(0f, 0f, 3.02f, 0.0f, 3.02f, 0f)
                curveToRelative(0f, 0f, 0.5f, -1.62f, 0.5f, -2.32f)
                curveToRelative(0f, -3f, -1.5f, -3.18f, -2.5f, -3.18f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                close()
            }
        }.also { _Evidence = it}
