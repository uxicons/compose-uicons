package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Rs.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 5f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-0.55f, -2.62f)
                curveToRelative(-0.29f, -1.38f, -1.52f, -2.38f, -2.94f, -2.38f)
                lineTo(5.77f, 0f)
                curveToRelative(-1.41f, 0f, -2.65f, 1.0f, -2.94f, 2.38f)
                lineToRelative(-0.55f, 2.62f)
                lineTo(1.0f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.21f)
                lineToRelative(1.67f, 14.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(10.29f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(1.67f, -14.35f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4.79f, 2.79f)
                curveToRelative(0.1f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f)
                horizontalLineToRelative(12.47f)
                curveToRelative(0.47f, 0f, 0.88f, 0.33f, 0.98f, 0.8f)
                lineToRelative(0.46f, 2.21f)
                lineTo(4.33f, 5f)
                lineToRelative(0.46f, -2.21f)
                close()
                moveTo(4.8f, 12f)
                horizontalLineToRelative(14.4f)
                lineToRelative(-0.58f, 5f)
                lineTo(5.38f, 17f)
                lineToRelative(-0.58f, -5f)
                close()
                moveTo(17.14f, 22f)
                lineTo(6.85f, 22f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.25f, -2.12f)
                horizontalLineToRelative(12.77f)
                lineToRelative(-0.25f, 2.12f)
                curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                close()
                moveTo(19.43f, 10f)
                lineTo(4.57f, 10f)
                lineToRelative(-0.35f, -3f)
                horizontalLineToRelative(15.56f)
                lineToRelative(-0.35f, 3f)
                close()
            }
        }.also { _CupTogo = it}
