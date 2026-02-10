package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Tr.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(23.5f, 20f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                verticalLineToRelative(1f)
                lineTo(0.5f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(19f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.61f)
                lineToRelative(-1.35f, -5.41f)
                lineToRelative(1.43f, -2.14f)
                curveToRelative(2.65f, 1f, 4.54f, 3.55f, 4.54f, 6.54f)
                close()
                moveTo(13.46f, 12.16f)
                lineToRelative(-1.38f, 2.07f)
                curveToRelative(-0.08f, 0.12f, -0.1f, 0.26f, -0.07f, 0.4f)
                lineToRelative(1.34f, 5.38f)
                horizontalLineToRelative(-2.72f)
                lineToRelative(1.34f, -5.38f)
                curveToRelative(0.03f, -0.14f, 0.01f, -0.28f, -0.07f, -0.4f)
                lineToRelative(-1.38f, -2.07f)
                curveToRelative(0.47f, -0.1f, 0.96f, -0.16f, 1.46f, -0.16f)
                reflectiveCurveToRelative(0.99f, 0.06f, 1.46f, 0.16f)
                close()
                moveTo(5f, 19f)
                curveToRelative(0f, -2.99f, 1.89f, -5.54f, 4.54f, -6.54f)
                lineToRelative(1.43f, 2.14f)
                lineToRelative(-1.35f, 5.41f)
                horizontalLineToRelative(-4.61f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Boss = it}
