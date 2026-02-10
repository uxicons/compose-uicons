package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterBolt: ImageVector? = null

val Icons.Rs.MeterBolt: ImageVector
    get() = _MeterBolt ?: UXIcon(name = "MeterBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.98f, 20.0f)
                horizontalLineToRelative(0.11f)
                lineToRelative(-1.93f, 3.24f)
                curveToRelative(-1.3f, 0.48f, -2.7f, 0.76f, -4.17f, 0.76f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(5.99f, 0f, 10.95f, 4.42f, 11.84f, 10.16f)
                lineToRelative(-2.4f, -1.43f)
                curveToRelative(-1.36f, -3.91f, -5.07f, -6.73f, -9.44f, -6.73f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.24f, 0f, 4.31f, -0.75f, 5.98f, -2.0f)
                close()
                moveTo(23.77f, 16.68f)
                curveToRelative(-0.27f, -0.43f, -0.74f, -0.69f, -1.25f, -0.69f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(2.96f, -4.99f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(-3.48f, 5.87f)
                curveToRelative(-0.23f, 0.46f, -0.21f, 1.0f, 0.07f, 1.44f)
                curveToRelative(0.27f, 0.44f, 0.74f, 0.7f, 1.26f, 0.7f)
                horizontalLineToRelative(4.12f)
                lineToRelative(-2.96f, 4.99f)
                lineToRelative(1.72f, 1.02f)
                lineToRelative(3.5f, -5.91f)
                curveToRelative(0.21f, -0.46f, 0.18f, -0.99f, -0.09f, -1.42f)
                close()
                moveTo(7f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MeterBolt = it}
