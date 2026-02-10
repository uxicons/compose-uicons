package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Br.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 8.73f)
            verticalLineToRelative(5.33f)
            curveToRelative(0f, 0.89f, -0.59f, 1.68f, -1.45f, 1.92f)
            lineToRelative(-3.55f, 1.02f)
            verticalLineToRelative(-7.58f)
            curveToRelative(0f, -0.91f, 0.6f, -1.71f, 1.48f, -1.97f)
            lineToRelative(1.32f, -0.38f)
            curveToRelative(1.1f, -0.32f, 2.21f, 0.51f, 2.21f, 1.66f)
            close()
            moveTo(9.52f, 7.45f)
            lineToRelative(-1.32f, -0.38f)
            curveToRelative(-1.1f, -0.32f, -2.21f, 0.51f, -2.21f, 1.66f)
            verticalLineToRelative(5.33f)
            curveToRelative(0f, 0.89f, 0.59f, 1.68f, 1.45f, 1.92f)
            lineToRelative(3.55f, 1.02f)
            verticalLineToRelative(-7.58f)
            curveToRelative(0f, -0.91f, -0.6f, -1.71f, -1.48f, -1.97f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CircleBookOpen = it }
