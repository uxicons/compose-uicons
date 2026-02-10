package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyTransferAlt: ImageVector? = null

val Icons.Bs.MoneyTransferAlt: ImageVector
    get() = _MoneyTransferAlt ?: UXIcon(name = "MoneyTransferAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3f, 5.05f)
                curveToRelative(-1.69f, 0.25f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(3f, 18f)
                lineTo(3f, 5.05f)
                close()
                moveTo(12f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(19.98f, 15.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.98f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.65f, -3.16f)
                curveToRelative(0.49f, -0.44f, 0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(-3.65f, -3.18f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(5f, 15f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(13f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _MoneyTransferAlt = it}
