package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Sr.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(9f, 10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(21f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(0.66f, 15.35f)
                lineTo(7.43f, 22.71f)
                curveToRelative(0.76f, 0.82f, 1.82f, 1.29f, 2.94f, 1.29f)
                horizontalLineToRelative(10.62f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-1.37f, 0f, -2.46f, 1.26f, -2.16f, 2.69f)
                curveToRelative(0.19f, 0.93f, 1.0f, 1.6f, 1.94f, 1.73f)
                lineToRelative(4.16f, 0.58f)
                curveToRelative(0.55f, 0.08f, 0.93f, 0.58f, 0.85f, 1.13f)
                curveToRelative(-0.08f, 0.55f, -0.58f, 0.93f, -1.13f, 0.85f)
                lineToRelative(-4.25f, -0.6f)
                curveToRelative(-2.06f, -0.29f, -3.62f, -2.09f, -3.62f, -4.17f)
                curveToRelative(0f, -0.22f, 0.03f, -0.43f, 0.07f, -0.64f)
                lineToRelative(-3.54f, -3.74f)
                curveToRelative(-0.46f, -0.5f, -1.1f, -0.8f, -1.79f, -0.83f)
                curveToRelative(-0.69f, -0.03f, -1.36f, 0.21f, -1.88f, 0.68f)
                curveToRelative(-1.05f, 0.96f, -1.14f, 2.6f, -0.19f, 3.67f)
                close()
            }
        }.also { _HandDryer = it}
