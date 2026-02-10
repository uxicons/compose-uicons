package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Evidence: ImageVector? = null

val Icons.Rs.Evidence: ImageVector
    get() = _Evidence ?: UXIcon(name = "Evidence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22.58f)
                lineToRelative(-6.24f, -6.24f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.33f)
                curveToRelative(0.0f, -5.52f, -4.49f, -10.01f, -10.01f, -10.01f)
                reflectiveCurveToRelative(-10.01f, 4.49f, -10.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10.01f, 10.01f, 10.01f)
                curveToRelative(2.4f, 0f, 4.61f, -0.85f, 6.33f, -2.26f)
                lineToRelative(6.24f, 6.24f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(2.0f, 10.01f)
                curveToRelative(0f, -4.42f, 3.59f, -8.01f, 8.01f, -8.01f)
                reflectiveCurveToRelative(8.01f, 3.59f, 8.01f, 8.01f)
                reflectiveCurveToRelative(-3.59f, 8.01f, -8.01f, 8.01f)
                reflectiveCurveToRelative(-8.01f, -3.59f, -8.01f, -8.01f)
                close()
                moveTo(15.02f, 8.69f)
                curveToRelative(0f, 0.7f, -0.5f, 2.32f, -0.5f, 2.32f)
                curveToRelative(0f, 0.0f, -3.02f, 0f, -3.02f, 0f)
                curveToRelative(-0.28f, -0.83f, -0.48f, -2.11f, -0.48f, -3.0f)
                curveToRelative(0f, -1.5f, 0.62f, -2.5f, 1.5f, -2.5f)
                curveToRelative(1.0f, 0f, 2.5f, 0.18f, 2.5f, 3.19f)
                close()
                moveTo(11.51f, 12.01f)
                horizontalLineToRelative(2.81f)
                curveToRelative(0f, 1.25f, -0.15f, 3.0f, -1.45f, 3.0f)
                curveToRelative(-0.74f, 0f, -1.36f, -0.63f, -1.36f, -1.5f)
                curveToRelative(0.01f, -0.31f, 0f, -1.5f, 0f, -1.5f)
                close()
                moveTo(9.01f, 8.01f)
                curveToRelative(0f, 0.89f, -0.21f, 2.17f, -0.48f, 3.0f)
                curveToRelative(0f, 0f, -3.02f, 0.0f, -3.02f, 0f)
                curveToRelative(0f, 0f, -0.5f, -1.62f, -0.5f, -2.32f)
                curveToRelative(0f, -3.0f, 1.5f, -3.19f, 2.5f, -3.19f)
                curveToRelative(0.88f, 0f, 1.5f, 1.0f, 1.5f, 2.5f)
                close()
                moveTo(8.51f, 12.01f)
                reflectiveCurveToRelative(-0.01f, 1.19f, 0f, 1.5f)
                curveToRelative(0f, 0.87f, -0.62f, 1.5f, -1.36f, 1.5f)
                curveToRelative(-1.3f, 0f, -1.45f, -1.75f, -1.45f, -3.0f)
                horizontalLineToRelative(2.81f)
                close()
            }
        }.also { _Evidence = it}
