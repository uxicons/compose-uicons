package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SummaryCheck: ImageVector? = null

val Icons.Ss.SummaryCheck: ImageVector
    get() = _SummaryCheck ?: UXIcon(name = "SummaryCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                curveToRelative(0f, -0.69f, 0.1f, -1.36f, 0.26f, -2f)
                lineTo(4f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.08f)
                curveToRelative(0.44f, -0.75f, 0.99f, -1.43f, 1.64f, -2f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                curveToRelative(0.69f, 0f, 1.36f, 0.1f, 2f, 0.26f)
                lineTo(20f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(12.72f, 24f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                lineTo(4f, 8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
            }
        }.also { _SummaryCheck = it}
