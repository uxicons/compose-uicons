package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertCreditCard: ImageVector? = null

val Icons.Tr.InsertCreditCard: ImageVector
    get() = _InsertCreditCard ?: UXIcon(name = "InsertCreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.76f, 1.31f, 3.2f, 3f, 3.45f)
                verticalLineToRelative(12.55f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 6.95f)
                curveToRelative(1.69f, -0.24f, 3f, -1.69f, 3f, -3.45f)
                close()
                moveTo(8f, 1f)
                horizontalLineToRelative(2f)
                lineTo(10f, 23f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 1f)
                close()
                moveTo(1f, 3.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                lineTo(3f, 5.95f)
                curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
                close()
                moveTo(4f, 19.5f)
                lineTo(4f, 1f)
                horizontalLineToRelative(3f)
                lineTo(7f, 22.95f)
                curveToRelative(-1.69f, -0.24f, -3f, -1.69f, -3f, -3.45f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(11f, 1f)
                horizontalLineToRelative(9f)
                lineTo(20f, 19.5f)
                close()
                moveTo(21f, 5.95f)
                lineTo(21f, 1.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                reflectiveCurveToRelative(-0.86f, 2.22f, -2f, 2.45f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _InsertCreditCard = it}
