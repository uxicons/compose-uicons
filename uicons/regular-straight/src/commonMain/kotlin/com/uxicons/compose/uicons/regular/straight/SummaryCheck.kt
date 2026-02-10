package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SummaryCheck: ImageVector? = null

val Icons.Rs.SummaryCheck: ImageVector
    get() = _SummaryCheck ?: UXIcon(name = "SummaryCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(-2f)
                lineTo(15f, 7f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(19.59f, 14.69f)
                lineToRelative(-3.23f, 3.17f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(1.84f, 1.79f)
                curveToRelative(0.31f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.17f, -0.48f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-1.4f, -1.43f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(3.95f)
                curveToRelative(0.36f, -0.73f, 0.82f, -1.4f, 1.36f, -2f)
                lineTo(5f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(9.54f, 22f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 4f)
                lineTo(18f, 4f)
                verticalLineToRelative(4.06f)
                curveToRelative(0.69f, 0.08f, 1.36f, 0.23f, 2f, 0.46f)
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
                lineTo(11.35f, 24f)
                curveToRelative(-0.7f, -0.57f, -1.31f, -1.25f, -1.81f, -2f)
                close()
            }
        }.also { _SummaryCheck = it}
