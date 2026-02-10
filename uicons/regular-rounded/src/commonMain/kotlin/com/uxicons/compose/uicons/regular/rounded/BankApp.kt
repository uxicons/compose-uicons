package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Rr.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.73f, 0f, 1.44f, 0.27f, 1.98f, 0.75f)
                curveToRelative(0.41f, 0.36f, 1.05f, 0.33f, 1.41f, -0.09f)
                curveToRelative(0.36f, -0.41f, 0.33f, -1.05f, -0.09f, -1.41f)
                curveToRelative(-0.91f, -0.81f, -2.09f, -1.25f, -3.31f, -1.25f)
                lineTo(5f, 0.0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(14f, 18f)
                verticalLineToRelative(1f)
                close()
                moveTo(23f, 12f)
                lineTo(23f, 7.95f)
                curveToRelative(0.57f, -0.12f, 1f, -0.59f, 1f, -1.19f)
                curveToRelative(0f, -0.45f, -0.25f, -0.87f, -0.65f, -1.09f)
                lineToRelative(-4.5f, -2.45f)
                curveToRelative(-0.54f, -0.29f, -1.18f, -0.29f, -1.72f, 0f)
                lineToRelative(-4.5f, 2.45f)
                curveToRelative(-0.4f, 0.22f, -0.65f, 0.64f, -0.65f, 1.09f)
                curveToRelative(0f, 0.6f, 0.43f, 1.08f, 1f, 1.19f)
                verticalLineToRelative(4.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(6f, 20f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _BankApp = it}
