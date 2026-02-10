package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Br.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(158.99f, 299.06f)
            curveTo(68.07f, 307.28f, -1.19f, 384.1f, 0.02f, 475.38f)
            verticalLineToRelative(4.63f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-5.91f)
            curveToRelative(-0.96f, -56.04f, 40.4f, -103.84f, 96f, -110.93f)
            curveToRelative(58.69f, -5.82f, 110.99f, 37.04f, 116.81f, 95.74f)
            curveToRelative(0.34f, 3.47f, 0.52f, 6.95f, 0.52f, 10.44f)
            verticalLineToRelative(10.67f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-10.67f)
            curveToRelative(-0.1f, -94.36f, -76.68f, -170.77f, -171.05f, -170.67f)
            curveTo(166.53f, 298.67f, 162.76f, 298.8f, 158.99f, 299.06f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(170.68f, 256.01f)
            curveToRelative(70.69f, 0f, 128f, -57.31f, 128f, -128f)
            reflectiveCurveToRelative(-57.31f, -128f, -128f, -128f)
            reflectiveCurveToRelative(-128f, 57.31f, -128f, 128f)
            curveTo(42.75f, 198.67f, 100.02f, 255.94f, 170.68f, 256.01f)
            close()
            moveTo(170.68f, 64.01f)
            curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
            reflectiveCurveToRelative(-28.65f, 64f, -64f, 64f)
            reflectiveCurveToRelative(-64f, -28.65f, -64f, -64f)
            reflectiveCurveTo(135.34f, 64.01f, 170.68f, 64.01f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(480.02f, 213.34f)
            horizontalLineToRelative(-32f)
            verticalLineToRelative(-32f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(32f)
            horizontalLineToRelative(-32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            horizontalLineToRelative(32f)
            verticalLineToRelative(32f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
            lineToRelative(0f, 0f)
            verticalLineToRelative(-32f)
            horizontalLineToRelative(32f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(497.69f, 213.34f, 480.02f, 213.34f)
            close()
        }
    }.also { _UserAdd = it }
