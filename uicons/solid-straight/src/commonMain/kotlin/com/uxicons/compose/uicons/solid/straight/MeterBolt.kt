package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterBolt: ImageVector? = null

val Icons.Ss.MeterBolt: ImageVector
    get() = _MeterBolt ?: UXIcon(name = "MeterBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.36f, 24.01f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(2.96f, -4.99f)
                horizontalLineToRelative(-4.12f)
                curveToRelative(-0.52f, 0f, -0.99f, -0.26f, -1.26f, -0.7f)
                curveToRelative(-0.27f, -0.44f, -0.3f, -0.98f, -0.07f, -1.44f)
                lineToRelative(3.48f, -5.87f)
                lineToRelative(1.72f, 1.02f)
                lineToRelative(-2.96f, 4.99f)
                horizontalLineToRelative(4.12f)
                curveToRelative(0.51f, 0f, 0.98f, 0.25f, 1.25f, 0.68f)
                curveToRelative(0.27f, 0.43f, 0.31f, 0.96f, 0.09f, 1.42f)
                lineToRelative(-3.5f, 5.91f)
                close()
                moveTo(16.15f, 23.26f)
                curveToRelative(-1.29f, 0.48f, -2.69f, 0.74f, -4.15f, 0.74f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(6.0f, 0f, 10.98f, 4.42f, 11.86f, 10.17f)
                lineToRelative(-4.86f, -2.89f)
                verticalLineToRelative(-0.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.52f)
                lineToRelative(-2.63f, 4.45f)
                curveToRelative(-0.54f, 1.09f, -0.48f, 2.35f, 0.16f, 3.39f)
                curveToRelative(0.64f, 1.03f, 1.75f, 1.65f, 2.96f, 1.65f)
                horizontalLineToRelative(0.61f)
                lineToRelative(-1.94f, 3.26f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _MeterBolt = it}
