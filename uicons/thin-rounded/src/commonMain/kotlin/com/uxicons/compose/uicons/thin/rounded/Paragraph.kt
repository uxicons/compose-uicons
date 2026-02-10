package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paragraph: ImageVector? = null

val Icons.Tr.Paragraph: ImageVector
    get() = _Paragraph ?: UXIcon(name = "Paragraph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 0f)
                horizontalLineToRelative(-15f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(16f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(22.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveTo(4.36f, 1f, 8.5f, 1f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Paragraph = it}
