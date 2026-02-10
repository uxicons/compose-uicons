package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Br.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.85f, 23.96f)
            curveToRelative(-0.12f, 0.03f, -0.24f, 0.04f, -0.35f, 0.04f)
            curveToRelative(-0.68f, 0f, -1.29f, -0.46f, -1.46f, -1.15f)
            curveToRelative(-0.55f, -2.27f, -2.62f, -3.85f, -5.04f, -3.85f)
            reflectiveCurveToRelative(-4.49f, 1.58f, -5.04f, 3.85f)
            curveToRelative(-0.2f, 0.81f, -1.0f, 1.3f, -1.81f, 1.1f)
            curveToRelative(-0.81f, -0.2f, -1.3f, -1.01f, -1.1f, -1.81f)
            curveToRelative(0.88f, -3.62f, 4.15f, -6.15f, 7.96f, -6.15f)
            reflectiveCurveToRelative(7.08f, 2.53f, 7.96f, 6.15f)
            curveToRelative(0.2f, 0.81f, -0.3f, 1.62f, -1.1f, 1.81f)
            close()
            moveTo(6f, 8f)
            lineTo(6f, 0.76f)
            curveToRelative(0f, -0.75f, 0.98f, -1.05f, 1.4f, -0.42f)
            lineToRelative(1.6f, 2.66f)
            lineTo(11.3f, 0.32f)
            curveToRelative(0.37f, -0.43f, 1.04f, -0.43f, 1.41f, 0f)
            lineToRelative(2.3f, 2.68f)
            lineToRelative(1.6f, -2.66f)
            curveToRelative(0.42f, -0.63f, 1.4f, -0.33f, 1.4f, 0.42f)
            verticalLineToRelative(7.24f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            close()
            moveTo(9f, 7f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.also { _UserCrown = it }
