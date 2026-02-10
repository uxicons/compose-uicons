package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Tr.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13.13f)
                lineTo(19f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                lineTo(5f, 13.13f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                lineTo(21f, 18f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                close()
                moveTo(18f, 4.5f)
                lineTo(18f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 1.04f)
                curveToRelative(1.69f, 0.24f, 3f, 1.7f, 3f, 3.46f)
                close()
                moveTo(10f, 13f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                lineTo(14f, 13f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(6f, 4.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.22f, 3f, -3.46f)
                lineTo(9f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 4.5f)
                close()
                moveTo(3f, 17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(3f, 17f)
                close()
            }
        }.also { _Chair = it}
