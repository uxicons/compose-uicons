package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WateringCanDrop: ImageVector? = null

val Icons.Ss.WateringCanDrop: ImageVector
    get() = _WateringCanDrop ?: UXIcon(name = "WateringCanDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16.8f)
                lineToRelative(-2.12f, 2.08f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, -0.01f, -4.25f)
                close()
                moveTo(22.5f, 10f)
                lineTo(21.5f, 12f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(3.2f, -4.36f)
                lineToRelative(-6.7f, -6.69f)
                lineToRelative(-1.8f, 1.41f)
                curveToRelative(-0.14f, -0.17f, -0.28f, -0.33f, -0.44f, -0.48f)
                curveToRelative(-2.5f, -2.49f, -6.56f, -2.49f, -9.06f, 0f)
                curveToRelative(-1.27f, 1.27f, -1.95f, 3.03f, -1.87f, 4.78f)
                lineToRelative(-0.01f, 4.01f)
                lineToRelative(10.18f, 10.17f)
                lineToRelative(5.02f, -6.84f)
                horizontalLineToRelative(6.3f)
                lineToRelative(1f, 2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-6f)
                close()
                moveTo(2.0f, 6.61f)
                curveToRelative(-0.06f, -1.24f, 0.41f, -2.44f, 1.28f, -3.32f)
                curveToRelative(0.86f, -0.86f, 1.99f, -1.29f, 3.11f, -1.29f)
                reflectiveCurveToRelative(2.26f, 0.43f, 3.12f, 1.29f)
                curveToRelative(0.1f, 0.1f, 0.19f, 0.2f, 0.28f, 0.3f)
                lineToRelative(-7.79f, 6.09f)
                lineToRelative(0.0f, -3.08f)
                close()
            }
        }.also { _WateringCanDrop = it}
