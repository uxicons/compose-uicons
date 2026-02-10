package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPointRibbon: ImageVector? = null

val Icons.Ss.HandPointRibbon: ImageVector
    get() = _HandPointRibbon ?: UXIcon(name = "HandPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(20.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7f, 7f)
                verticalLineToRelative(2.04f)
                curveToRelative(0.84f, -0.01f, 1.67f, 0.23f, 2.37f, 0.75f)
                curveToRelative(0.24f, 0.18f, 0.44f, 0.38f, 0.63f, 0.6f)
                lineTo(10f, 4f)
                lineTo(2f, 4f)
                lineToRelative(2f, 1.5f)
                lineToRelative(-2f, 1.5f)
                lineTo(7f, 7f)
                close()
                moveTo(12.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(18.5f, 16.37f)
                curveToRelative(-0.61f, 0.42f, -1.36f, 0.66f, -2.16f, 0.63f)
                curveToRelative(-0.68f, -0.03f, -1.3f, -0.27f, -1.81f, -0.65f)
                curveToRelative(-0.57f, 0.41f, -1.27f, 0.66f, -2.02f, 0.66f)
                curveToRelative(-1.09f, 0f, -2.05f, -0.5f, -2.69f, -1.28f)
                lineToRelative(-2.17f, 2.18f)
                lineToRelative(-1.45f, -1.38f)
                lineToRelative(2.21f, -2.1f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.24f, 0.33f, -0.44f)
                curveToRelative(0.47f, -0.84f, 0.28f, -1.95f, -0.56f, -2.58f)
                curveToRelative(-0.81f, -0.6f, -1.97f, -0.44f, -2.68f, 0.28f)
                lineToRelative(-2.5f, 2.46f)
                curveToRelative(-1.32f, 1.3f, -1.33f, 3.44f, -0.01f, 4.75f)
                lineToRelative(5.18f, 5.13f)
                horizontalLineToRelative(13.84f)
                verticalLineToRelative(-7.34f)
                curveToRelative(-0.46f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                curveToRelative(-0.74f, 0f, -1.43f, -0.23f, -2f, -0.63f)
                close()
                moveTo(10f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _HandPointRibbon = it}
