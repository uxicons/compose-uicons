package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PremiumAccount: ImageVector? = null

val Icons.Sr.PremiumAccount: ImageVector
    get() = _PremiumAccount ?: UXIcon(name = "PremiumAccount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 5.0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.2f, 0.12f, -0.38f, 0.3f, -0.46f)
                curveToRelative(0.18f, -0.08f, 0.39f, -0.05f, 0.54f, 0.09f)
                lineToRelative(1.38f, 1.24f)
                lineToRelative(0.86f, -0.95f)
                curveToRelative(0.5f, -0.56f, 1.37f, -0.56f, 1.86f, 0f)
                lineToRelative(0.86f, 0.95f)
                lineToRelative(1.38f, -1.24f)
                curveToRelative(0.15f, -0.13f, 0.36f, -0.16f, 0.54f, -0.09f)
                curveToRelative(0.18f, 0.08f, 0.3f, 0.26f, 0.3f, 0.46f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(10f, 9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.89f, -1.99f, -1.99f, -2.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.1f, 0.01f, -1.99f, 0.9f, -1.99f, 2.0f)
                close()
                moveTo(18f, 1.62f)
                verticalLineToRelative(2.38f)
                curveToRelative(0f, 1.51f, -1.12f, 2.75f, -2.58f, 2.96f)
                curveToRelative(0.36f, 0.6f, 0.58f, 1.29f, 0.58f, 2.04f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.75f, 0.22f, -1.44f, 0.58f, -2.04f)
                curveToRelative(-1.45f, -0.21f, -2.58f, -1.45f, -2.58f, -2.96f)
                verticalLineToRelative(-2.38f)
                curveToRelative(-3.58f, 2.08f, -6f, 5.95f, -6f, 10.38f)
                reflectiveCurveToRelative(2.42f, 8.31f, 6f, 10.39f)
                verticalLineToRelative(-1.39f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1.39f)
                curveToRelative(3.58f, -2.08f, 6f, -5.96f, 6f, -10.39f)
                reflectiveCurveToRelative(-2.42f, -8.3f, -6f, -10.38f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2.31f)
                curveToRelative(1.25f, 0.44f, 2.6f, 0.69f, 4f, 0.69f)
                reflectiveCurveToRelative(2.75f, -0.24f, 4f, -0.69f)
                verticalLineToRelative(-2.31f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _PremiumAccount = it}
