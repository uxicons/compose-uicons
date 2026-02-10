package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Tr.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(15f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11.5f)
                curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.09f, 20f)
                curveToRelative(0.07f, 0.2f, 0.19f, 0.4f, 0.35f, 0.56f)
                lineToRelative(2.43f, 2.6f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.02f, 0.71f)
                curveToRelative(-0.1f, 0.09f, -0.22f, 0.14f, -0.34f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.27f, -0.05f, -0.36f, -0.16f)
                lineToRelative(-2.41f, -2.59f)
                curveToRelative(-0.96f, -0.96f, -0.96f, -2.55f, 0.01f, -3.52f)
                lineToRelative(2.4f, -2.57f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.02f)
                curveToRelative(0.2f, 0.19f, 0.21f, 0.51f, 0.02f, 0.71f)
                lineToRelative(-2.41f, 2.59f)
                curveToRelative(-0.17f, 0.17f, -0.29f, 0.36f, -0.36f, 0.57f)
                horizontalLineToRelative(20.41f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _ParagraphLeft = it}
