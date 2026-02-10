package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberList: ImageVector? = null

val Icons.Br.MemberList: ImageVector
    get() = _MemberList ?: UXIcon(name = "MemberList") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 11f)
            horizontalLineToRelative(-5.0f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(7.0f)
            curveToRelative(0f, 1.66f, 1.34f, 3.0f, 3.0f, 3f)
            lineToRelative(5f, 0.0f)
            curveToRelative(1.66f, 0f, 3.0f, -1.34f, 3.0f, -3f)
            verticalLineToRelative(-7.0f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(17.0f, 14.0f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            close()
            moveTo(20.0f, 20f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, -0.0f, -1f, -0.45f, -1f, -1.0f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1f, -1.0f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(0.0f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            close()
            moveTo(9f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(12.31f, 0f, 9f, 0f)
            reflectiveCurveTo(3f, 2.69f, 3f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(11f, 15.47f)
            curveToRelative(0.02f, 0.83f, -0.64f, 1.51f, -1.47f, 1.53f)
            lineToRelative(-1.05f, 0.02f)
            curveToRelative(-2.9f, 0.21f, -5.29f, 2.61f, -5.48f, 5.58f)
            curveToRelative(-0.05f, 0.79f, -0.71f, 1.4f, -1.5f, 1.4f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.0f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.77f, -1.4f, -1.6f)
            curveToRelative(0.3f, -4.46f, 3.88f, -8.06f, 8.34f, -8.38f)
            lineToRelative(1.13f, -0.02f)
            curveToRelative(0.84f, -0.05f, 1.51f, 0.64f, 1.53f, 1.47f)
            close()
        }
    }.also { _MemberList = it }
