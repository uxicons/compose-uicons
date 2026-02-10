package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantWilt: ImageVector? = null

val Icons.Rs.PlantWilt: ImageVector
    get() = _PlantWilt ?: UXIcon(name = "PlantWilt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 12.14f)
                curveToRelative(-0.14f, -4.51f, -2.74f, -6.14f, -4.99f, -6.14f)
                curveToRelative(-1.01f, 0f, -2.1f, 0.33f, -3f, 1.1f)
                verticalLineToRelative(-0.6f)
                curveTo(13f, 1.7f, 10.31f, 0f, 8f, 0f)
                curveTo(5.75f, 0f, 3.15f, 1.62f, 3.01f, 6.14f)
                curveToRelative(-1.73f, 0.44f, -3.01f, 2.0f, -3.01f, 3.86f)
                curveToRelative(0f, 2.83f, 2.96f, 5.87f, 3.29f, 6.21f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.34f, -0.34f, 3.29f, -3.38f, 3.29f, -6.21f)
                curveToRelative(0f, -1.85f, -1.27f, -3.4f, -2.99f, -3.85f)
                curveToRelative(0.13f, -3.83f, 2.31f, -4.15f, 2.99f, -4.15f)
                curveToRelative(0.7f, 0f, 3f, 0.33f, 3f, 4.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -4.17f, 2.3f, -4.5f, 3f, -4.5f)
                curveToRelative(0.68f, 0f, 2.86f, 0.32f, 2.99f, 4.15f)
                curveToRelative(-1.71f, 0.45f, -2.99f, 2f, -2.99f, 3.85f)
                curveToRelative(0f, 2.83f, 2.96f, 5.87f, 3.29f, 6.21f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.34f, -0.34f, 3.29f, -3.38f, 3.29f, -6.21f)
                curveToRelative(0f, -1.86f, -1.29f, -3.42f, -3.01f, -3.86f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, 1.29f, -1.13f, 2.95f, -2.0f, 4.01f)
                curveToRelative(-0.87f, -1.05f, -2.0f, -2.71f, -2.0f, -4.01f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(20.0f, 20.01f)
                curveToRelative(-0.87f, -1.05f, -2.0f, -2.71f, -2.0f, -4.01f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.29f, -1.13f, 2.95f, -2.0f, 4.01f)
                close()
            }
        }.also { _PlantWilt = it}
