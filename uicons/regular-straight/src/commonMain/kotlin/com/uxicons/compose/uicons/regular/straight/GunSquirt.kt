package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunSquirt: ImageVector? = null

val Icons.Rs.GunSquirt: ImageVector
    get() = _GunSquirt ?: UXIcon(name = "GunSquirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(5f, 2f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2.49f)
                lineTo(0.11f, 20.33f)
                curveToRelative(-0.24f, 0.88f, -0.07f, 1.8f, 0.48f, 2.52f)
                curveToRelative(0.55f, 0.73f, 1.39f, 1.14f, 2.3f, 1.14f)
                curveToRelative(1.29f, 0f, 2.44f, -0.87f, 2.78f, -2.1f)
                lineToRelative(1.11f, -3.9f)
                horizontalLineToRelative(3.22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.14f, -4f)
                horizontalLineToRelative(8.5f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(2.1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3.75f, 21.35f)
                curveToRelative(-0.11f, 0.38f, -0.46f, 0.65f, -0.86f, 0.65f)
                curveToRelative(-0.28f, 0f, -0.54f, -0.12f, -0.71f, -0.35f)
                curveToRelative(-0.17f, -0.23f, -0.23f, -0.5f, -0.15f, -0.77f)
                lineToRelative(2.54f, -8.88f)
                horizontalLineToRelative(1.84f)
                lineToRelative(-2.67f, 9.35f)
                close()
                moveTo(17f, 10f)
                lineTo(2f, 10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(15f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                lineTo(4f, 8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _GunSquirt = it}
