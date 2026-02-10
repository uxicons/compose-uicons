package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstAidKit: ImageVector? = null

val Icons.Br.FirstAidKit: ImageVector
    get() = _FirstAidKit ?: UXIcon(name = "FirstAidKit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(10f, 3.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(14.5f, 15.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
        }
    }.also { _FirstAidKit = it }
