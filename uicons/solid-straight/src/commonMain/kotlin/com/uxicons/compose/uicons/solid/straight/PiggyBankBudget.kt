package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBankBudget: ImageVector? = null

val Icons.Ss.PiggyBankBudget: ImageVector
    get() = _PiggyBankBudget ?: UXIcon(name = "PiggyBankBudget") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(8f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.67f, 1.63f, -1.87f, 3.01f, -3.41f, 3.91f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-2.45f, -1.42f, -4f, -4.07f, -4f, -6.92f)
                curveToRelative(0f, -1.18f, 0.26f, -2.29f, 0.72f, -3.3f)
                curveToRelative(-1.01f, -0.48f, -1.72f, -1.51f, -1.72f, -2.7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.48f, 0.35f, 0.86f, 0.8f, 0.96f)
                curveToRelative(0.84f, -1.04f, 1.95f, -1.85f, 3.2f, -2.36f)
                verticalLineToRelative(3.4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                curveToRelative(0.12f, 0f, 0.23f, 0.02f, 0.34f, 0.03f)
                curveToRelative(1.11f, -3.01f, 4.66f, -3.03f, 4.66f, -3.03f)
                verticalLineToRelative(4.81f)
                curveToRelative(1.04f, 0.84f, 1.9f, 1.92f, 2.41f, 3.19f)
                horizontalLineToRelative(1.59f)
                close()
                moveTo(19f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _PiggyBankBudget = it}
