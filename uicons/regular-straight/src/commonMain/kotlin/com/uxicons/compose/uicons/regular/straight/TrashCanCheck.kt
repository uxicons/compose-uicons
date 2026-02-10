package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanCheck: ImageVector? = null

val Icons.Rs.TrashCanCheck: ImageVector
    get() = _TrashCanCheck ?: UXIcon(name = "TrashCanCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.09f, 16.41f)
                lineToRelative(-2.35f, -2.26f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.36f, 2.27f)
                lineToRelative(5.13f, -5.02f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.11f, 5.03f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.59f)
                close()
                moveTo(22f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _TrashCanCheck = it}
