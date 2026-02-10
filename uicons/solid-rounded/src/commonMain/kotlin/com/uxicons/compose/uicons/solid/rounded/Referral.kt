package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referral: ImageVector? = null

val Icons.Sr.Referral: ImageVector
    get() = _Referral ?: UXIcon(name = "Referral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 14f)
                lineTo(1f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(6.93f, 0f, 5f, 0f)
                reflectiveCurveTo(1.5f, 1.57f, 1.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(19f, 8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(19f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.35f, 15.55f)
                curveToRelative(-0.73f, -0.73f, -1.92f, -0.73f, -2.62f, -0.02f)
                lineToRelative(-2.41f, 2.24f)
                curveToRelative(-0.4f, 0.38f, -0.43f, 1.01f, -0.05f, 1.41f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0f, 0.49f, -0.09f, 0.68f, -0.27f)
                lineToRelative(1.32f, -1.23f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2.02f)
                lineToRelative(1.31f, 1.25f)
                curveToRelative(0.4f, 0.38f, 1.03f, 0.37f, 1.41f, -0.03f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.03f, -1.41f)
                lineToRelative(-2.34f, -2.23f)
                close()
            }
        }.also { _Referral = it}
