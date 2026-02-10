package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressCard: ImageVector? = null

val Icons.Rr.AddressCard: ImageVector
    get() = _AddressCard ?: UXIcon(name = "AddressCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(22f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(16.98f, 14.45f)
                lineToRelative(-5.29f, 5.27f)
                curveToRelative(-0.51f, 0.51f, -1.2f, 0.78f, -1.91f, 0.78f)
                curveToRelative(-0.37f, 0f, -0.74f, -0.07f, -1.1f, -0.22f)
                curveToRelative(-1.03f, -0.42f, -1.68f, -1.35f, -1.68f, -2.42f)
                verticalLineToRelative(-1.86f)
                lineTo(3f, 16f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0.01f, -1.07f, 0.65f, -2.0f, 1.68f, -2.42f)
                curveToRelative(1.05f, -0.43f, 2.24f, -0.21f, 3.01f, 0.56f)
                lineToRelative(5.29f, 5.27f)
                curveToRelative(1.35f, 1.35f, 1.35f, 3.55f, 0f, 4.9f)
                close()
                moveTo(15.57f, 10.96f)
                lineToRelative(-5.29f, -5.27f)
                curveToRelative(-0.24f, -0.24f, -0.59f, -0.22f, -0.84f, -0.12f)
                curveToRelative(-0.13f, 0.06f, -0.44f, 0.22f, -0.44f, 0.58f)
                verticalLineToRelative(2.85f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.86f)
                curveToRelative(0.0f, 0.35f, 0.31f, 0.52f, 0.44f, 0.57f)
                curveToRelative(0.24f, 0.1f, 0.59f, 0.12f, 0.84f, -0.12f)
                lineToRelative(5.29f, -5.27f)
                curveToRelative(0.57f, -0.57f, 0.57f, -1.5f, 0f, -2.07f)
                close()
            }
        }.also { _AddressCard = it}
