package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentFlag: ImageVector? = null

val Icons.Br.GovernmentFlag: ImageVector
    get() = _GovernmentFlag ?: UXIcon(name = "GovernmentFlag") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-6.05f)
            curveToRelative(1.14f, -0.21f, 2f, -1.21f, 2f, -2.41f)
            curveToRelative(0f, -0.9f, -0.49f, -1.73f, -1.28f, -2.16f)
            lineToRelative(-8.17f, -4.46f)
            curveToRelative(-0.01f, -0.01f, -0.03f, -0.01f, -0.05f, -0.02f)
            verticalLineToRelative(-1.41f)
            lineToRelative(2.1f, -1.49f)
            curveToRelative(0.54f, -0.36f, 0.53f, -1.16f, -0.02f, -1.51f)
            lineTo(12.88f, 0.24f)
            curveToRelative(-0.25f, -0.15f, -0.53f, -0.24f, -0.82f, -0.24f)
            curveToRelative(-0.86f, 0f, -1.55f, 0.7f, -1.55f, 1.55f)
            verticalLineToRelative(4.36f)
            curveToRelative(-0.01f, 0.01f, -0.03f, 0.01f, -0.04f, 0.02f)
            lineTo(2.28f, 10.39f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.79f, 0.43f, -1.28f, 1.26f, -1.28f, 2.16f)
            curveToRelative(0f, 1.2f, 0.86f, 2.2f, 2f, 2.41f)
            verticalLineToRelative(6.05f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(19f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13f, 15f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(2f)
            close()
            moveTo(16f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-6f)
            close()
            moveTo(11.89f, 8.56f)
            curveToRelative(0.07f, -0.04f, 0.15f, -0.04f, 0.22f, 0f)
            lineToRelative(6.3f, 3.44f)
            lineTo(5.58f, 12f)
            lineToRelative(6.31f, -3.44f)
            close()
            moveTo(6f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-6f)
            close()
        }
    }.also { _GovernmentFlag = it }
