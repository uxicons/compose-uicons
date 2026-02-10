package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Tr.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.15f, 1.85f)
                curveToRelative(-0.09f, 0.2f, -0.15f, 0.41f, -0.15f, 0.65f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(-0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.23f, 0f, -0.45f, 0.05f, -0.65f, 0.15f)
                lineTo(15.35f, 14.65f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(1.15f, 1.85f)
                close()
                moveTo(14f, 4f)
                curveToRelative(-1.65f, 0f, -3.29f, 0.41f, -4.74f, 1.19f)
                curveToRelative(-0.24f, 0.13f, -0.33f, 0.43f, -0.2f, 0.68f)
                curveToRelative(0.13f, 0.24f, 0.43f, 0.34f, 0.68f, 0.2f)
                curveToRelative(1.3f, -0.7f, 2.77f, -1.07f, 4.26f, -1.07f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(5f, 18.96f, 5f, 14f)
                curveToRelative(0f, -1.49f, 0.37f, -2.96f, 1.07f, -4.26f)
                curveToRelative(0.13f, -0.24f, 0.04f, -0.55f, -0.2f, -0.68f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.04f, -0.68f, 0.2f)
                curveToRelative(-0.78f, 1.45f, -1.19f, 3.08f, -1.19f, 4.74f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 4f, 14f, 4f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
