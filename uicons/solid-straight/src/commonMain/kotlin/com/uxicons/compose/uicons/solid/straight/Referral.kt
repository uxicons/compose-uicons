package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referral: ImageVector? = null

val Icons.Ss.Referral: ImageVector
    get() = _Referral ?: UXIcon(name = "Referral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(6.93f, 0f, 5f, 0f)
                reflectiveCurveTo(1.5f, 1.57f, 1.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.35f, 15.55f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.6f, -1.6f)
                verticalLineToRelative(2.97f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.92f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.73f, -0.73f, 1.92f, -0.73f, 2.65f, 0f)
                close()
            }
        }.also { _Referral = it}
