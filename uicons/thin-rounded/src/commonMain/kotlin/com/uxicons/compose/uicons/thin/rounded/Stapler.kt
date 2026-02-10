package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Tr.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 16.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 13.48f)
                verticalLineToRelative(4.02f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.39f)
                lineToRelative(-0.18f, -0.04f)
                curveToRelative(-1.28f, -0.33f, -2.07f, -1.63f, -1.75f, -2.92f)
                curveToRelative(0.56f, -2.46f, 3.25f, -4.08f, 5.68f, -3.42f)
                lineToRelative(14.01f, 3.78f)
                curveToRelative(2.48f, 0.67f, 4.22f, 2.91f, 4.23f, 5.46f)
                curveToRelative(0f, 0.01f, 0.0f, 0.01f, 0.0f, 0.01f)
                close()
                moveTo(15.52f, 14f)
                lineTo(3f, 10.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(22.97f, 13f)
                curveToRelative(-0.21f, -1.9f, -1.57f, -3.51f, -3.47f, -4.02f)
                lineToRelative(-14.01f, -3.78f)
                curveToRelative(-1.9f, -0.52f, -4.02f, 0.76f, -4.46f, 2.69f)
                curveToRelative(-0.19f, 0.75f, 0.27f, 1.52f, 1.02f, 1.71f)
                lineToRelative(13.58f, 3.4f)
                horizontalLineToRelative(7.33f)
                close()
                moveTo(23f, 14f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Stapler = it}
