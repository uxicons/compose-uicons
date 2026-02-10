package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDrizzle: ImageVector? = null

val Icons.Ts.CloudDrizzle: ImageVector
    get() = _CloudDrizzle ?: UXIcon(name = "CloudDrizzle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(17.0f, 5.02f)
                curveTo(15.87f, 2.0f, 13.0f, 0f, 9.75f, 0f)
                curveTo(5.48f, 0f, 2f, 3.48f, 2f, 7.75f)
                curveToRelative(0f, 0.76f, 0.12f, 1.52f, 0.34f, 2.27f)
                curveToRelative(-1.48f, 1.03f, -2.35f, 2.68f, -2.35f, 4.48f)
                curveToRelative(0f, 2.51f, 1.7f, 4.63f, 4f, 5.29f)
                verticalLineToRelative(-1.08f)
                curveToRelative(-1.74f, -0.62f, -3f, -2.25f, -3f, -4.21f)
                curveToRelative(0f, -1.58f, 0.82f, -3.02f, 2.2f, -3.85f)
                lineToRelative(0.35f, -0.21f)
                lineToRelative(-0.14f, -0.39f)
                curveToRelative(-0.27f, -0.75f, -0.41f, -1.53f, -0.41f, -2.3f)
                curveToRelative(0f, -3.72f, 3.03f, -6.75f, 6.75f, -6.75f)
                curveToRelative(2.93f, 0f, 5.51f, 1.87f, 6.42f, 4.66f)
                lineToRelative(0.11f, 0.34f)
                lineToRelative(0.35f, 0.01f)
                curveToRelative(3.51f, 0.07f, 6.37f, 2.98f, 6.37f, 6.49f)
                curveToRelative(0f, 2.29f, -1.24f, 4.39f, -3f, 5.54f)
                verticalLineToRelative(1.15f)
                curveToRelative(2.32f, -1.25f, 4f, -3.84f, 4f, -6.7f)
                curveToRelative(0f, -3.93f, -3.11f, -7.22f, -7.0f, -7.48f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _CloudDrizzle = it}
